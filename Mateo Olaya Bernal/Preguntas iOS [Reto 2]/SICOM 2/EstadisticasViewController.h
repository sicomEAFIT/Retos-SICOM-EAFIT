//
//  EstadisticasViewController.h
//  SICOM 2
//
//  Created by Mateo Olaya Bernal on 28/02/13.
//  Copyright (c) 2013 Mateo Olaya Bernal. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface EstadisticasViewController : UIViewController
{
    __weak IBOutlet UILabel *nota;
    __weak IBOutlet UILabel *porcentaje;
    
}
@property (nonatomic) NSUInteger note;
@end
