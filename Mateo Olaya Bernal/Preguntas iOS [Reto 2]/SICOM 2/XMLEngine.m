//
//  XMLEngine.m
//  SICOM 2
//
//  Created by Mateo Olaya Bernal on 26/02/13.
//  Copyright (c) 2013 Mateo Olaya Bernal. All rights reserved.
//

#import "XMLEngine.h"

@implementation XMLEngine
@synthesize data = _data, xml = _xml, xmlData = _xmlData;

#pragma mark - Method inicializations
- (id)initWhitXMLFile:(NSURL *)url
{
    // Inicio unico del objeto, es necesario especificar la url del archivo o se encontrara un error y no se podra continuar.
    self = [super init]; // inicializar el objeto y todos sus elementos:
    if (self) {
        nodes = [[NSMutableArray alloc] initWithCapacity:kElementsPerNode];
        _data = [[NSMutableArray alloc] initWithCapacity:kMaxQuestions];
         _xml = [[NSXMLParser alloc] initWithContentsOfURL:url];
        [_xml setDelegate:self]; // el delegado del XMLParser es %self%
        [_xml parse];
    }
    return self;
}


#pragma mark - NSXMLParser delegate
- (void)parser:(NSXMLParser *)parser didStartElement:(NSString *)elementName namespaceURI:(NSString *)namespaceURI qualifiedName:(NSString *)qName attributes:(NSDictionary *)attributeDict
{
    if ([elementName isEqualToString:@"item"]) {
        _xmlData = [[XMLData alloc] init];
        nodes = [[NSMutableArray alloc] initWithCapacity:kElementsPerNode];
        [_xmlData setQuestion:[attributeDict objectForKey:@"value"]];
        [_xmlData setAnswereID:[[attributeDict objectForKey:@"answere"] integerValue]];
    }
    
    if ([elementName isEqualToString:@"respuesta"]) {
        [nodes addObject:[attributeDict objectForKey:@"value"]];
    }
}

- (void)parser:(NSXMLParser *)parser didEndElement:(NSString *)elementName namespaceURI:(NSString *)namespaceURI qualifiedName:(NSString *)qName
{
    if ([elementName isEqualToString:@"item"]) {
        [_xmlData setAnsweres:nodes];
        [_data addObject:_xmlData];
    }
}
@end
