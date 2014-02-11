//
//  MainViewController.m
//  SICOM 2
//
//  Created by Mateo Olaya Bernal on 28/02/13.
//  Copyright (c) 2013 Mateo Olaya Bernal. All rights reserved.
//

#import "MainViewController.h"

@interface MainViewController ()

@end

@implementation MainViewController

#pragma mark - View init:

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
    i = 0;
    note = 0;
    xml = [[XMLEngine alloc] initWhitXMLFile:[NSURL fileURLWithPath:[[NSBundle mainBundle] pathForResource:@"data" ofType:@"xml"]]];
    
    [self setParams];
    [super viewDidLoad];
	// Do any additional setup after loading the view.
}

- (void)viewDidAppear:(BOOL)animated
{
    note = 0;
}
- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


- (void)setParams
{
    data = [[xml data] objectAtIndex:i];
    [questionLabel setText:data.question];
    [buttonA setTitle:[data.answeres objectAtIndex:0] forState:UIControlStateNormal];
    [buttonB setTitle:[data.answeres objectAtIndex:1] forState:UIControlStateNormal];
}
#pragma mark - IBActions

- (IBAction)answereWithButton:(id)sender
{
    UIButton *button = (UIButton *)sender;
    if (button.tag == 10) { // Opcion A
        if (data.answereID == 0) {
            ++note;
        }
    }
    if (button.tag == 20) { // Opcion B
        if (data.answereID == 1) {
            ++note;
        }
    }
    
    ++i;
    if (i < [[xml data] count]) {
        [self setParams];
    } else {
        i = 0; // Evita errores en indices del arreglo !!!!!!!
        [self performSegueWithIdentifier:@"estadisticas_segue" sender:nil];
    }
    
}

- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender
{
    if ([segue.identifier isEqualToString:@"estadisticas_segue"]) {
        EstadisticasViewController *est = (EstadisticasViewController *)segue.destinationViewController;
        [est setNote:note];
    }
}

@end
