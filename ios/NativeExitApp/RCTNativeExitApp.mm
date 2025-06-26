//
//  RCTNativeExitApp.m
//  RNExitApp
//
//  Created by calvin on 6/25/25.
//

#import "RCTNativeExitApp.h"

@interface RCTNativeExitApp()
@end

@implementation RCTNativeExitApp

- (void)exitApp {
  exit(0);
}

- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:(const facebook::react::ObjCTurboModule::InitParams &)params {
  return std::make_shared<facebook::react::NativeExitAppSpecJSI>(params); // Return a shared pointer to a TurboModule
}

+ (NSString *)moduleName
{
  return @"NativeExitApp";
}

@end
