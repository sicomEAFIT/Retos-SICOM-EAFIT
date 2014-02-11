//
//  XMLData.h
//  SICOM 2
//
//  Created by Mateo Olaya Bernal on 28/02/13.
//  Copyright (c) 2013 Mateo Olaya Bernal. All rights reserved.
//

#import <Foundation/Foundation.h>

@interface XMLData : NSObject
@property (nonatomic, strong) NSString *question; // Pregunta
@property (nonatomic        ) NSUInteger answereID; // Identificador de la respuesta
@property (nonatomic, strong) NSArray *answeres; // Posibles respuestas su contenido se ordena ( @{ CADENA "RESPUESTA", ENTERO ID}


@end
