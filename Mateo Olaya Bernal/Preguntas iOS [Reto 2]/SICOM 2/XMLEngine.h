//
//  XMLEngine.h
//  SICOM 2
//
//  Created by Mateo Olaya Bernal on 26/02/13.
//  Copyright (c) 2013 Mateo Olaya Bernal. All rights reserved.
//

#define kElementsPerNode 2
#define kMaxQuestions 1024
#import <Foundation/Foundation.h>
#import "XMLData.h"

@interface XMLEngine : NSObject <NSXMLParserDelegate>
{
    NSMutableArray *nodes;
}
@property (nonatomic, retain) XMLData *xmlData;
@property (nonatomic, strong) NSXMLParser *xml;
@property (nonatomic, strong, readonly) NSMutableArray *data;

- (id)initWhitXMLFile:(NSURL *)url;

@end
