//
//  MainViewController.m
//  SICOM 1
//
//  Created by Mateo Olaya on 2/22/13.
//  Copyright (c) 2013 Mateo Olaya Bernal. All rights reserved.
//

#import "MainViewController.h"

@interface MainViewController ()

@end

@implementation MainViewController

- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
    self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
    if (self) {
        // Custom initialization
    }
    return self;
}

- (void)touchesBegan:(NSSet *)touches withEvent:(UIEvent *)event
{
    float red, green, blue;
    red = (float) (rand() % 255)/255;
    green = (float) (rand() % 255)/255;
    blue = (float) (rand() % 255)/255;
    
    [[self view] setBackgroundColor:[UIColor colorWithRed:red green:green blue:blue alpha:1]];
    [labelRGB setText:[NSString stringWithFormat:@"Rojo:%0.f, Verde:%0.f, Azul:%0.f", red*255, green*255, blue*255]];
    [labelHEX setText:[self hexOfRed:red*255 green:green*255 blue:blue*255]];
}

- (NSString *)hexOfRed:(int)red green:(int)green blue:(int)blue
{
    return [NSString stringWithFormat:@"#%x%x%x%x%x%x", (red >> 4), (red & 0xF), (green >> 4), (green & 0xF), (blue >> 4), (blue & 0xF)]; //Convierte 0/255 en hexadecimal
}
- (void)viewDidLoad
{
    [NSTimer scheduledTimerWithTimeInterval:5 target:self selector:@selector(hideInfo) userInfo:nil repeats:NO];
    [super viewDidLoad];
	// Do any additional setup after loading the view.
}

- (void)hideInfo
{
    [info setHidden:YES];
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (void)dealloc {
    [labelRGB release];
    [info release];
    [labelHEX release];
    [super dealloc];
}
- (void)viewDidUnload {
    [labelRGB release];
    labelRGB = nil;
    [info release];
    info = nil;
    [labelHEX release];
    labelHEX = nil;
    [super viewDidUnload];
}
@end
