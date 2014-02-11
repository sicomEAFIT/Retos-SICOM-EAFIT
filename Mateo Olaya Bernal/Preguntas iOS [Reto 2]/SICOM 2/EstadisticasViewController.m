//
//  EstadisticasViewController.m
//  SICOM 2
//
//  Created by Mateo Olaya Bernal on 28/02/13.
//  Copyright (c) 2013 Mateo Olaya Bernal. All rights reserved.
//

#import "EstadisticasViewController.h"

@interface EstadisticasViewController ()

@end

@implementation EstadisticasViewController
@synthesize note;

- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
    self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
    if (self) {
        // Custom initialization
    }
    return self;
}

- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void)viewDidAppear:(BOOL)animated
{
    [nota setText:[NSString stringWithFormat:@"Usted tuvo %d de 14 buenas.", note]];
    [porcentaje setText:[NSString stringWithFormat:@"Su porcentaje fue %.1f%%", ((float) note/14)*100]];
}

@end
