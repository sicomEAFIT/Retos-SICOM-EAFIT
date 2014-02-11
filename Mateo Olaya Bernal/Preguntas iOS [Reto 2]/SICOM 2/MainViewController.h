//
//  MainViewController.h
//  SICOM 2
//
//  Created by Mateo Olaya Bernal on 28/02/13.
//  Copyright (c) 2013 Mateo Olaya Bernal. All rights reserved.
//

#import <UIKit/UIKit.h>
#import "XMLEngine.h"
#import "EstadisticasViewController.h"

@interface MainViewController : UIViewController
{
    __weak IBOutlet UILabel *questionLabel;
    __weak IBOutlet UIButton *buttonA;
    __weak IBOutlet UIButton *buttonB;
    XMLEngine *xml;
    XMLData *data;
    NSArray *currentQuestion;
    
    int i; // posicion actual en el XML "Fila de preguntas"
    int note;
}

- (IBAction)answereWithButton:(id)sender;

@end
