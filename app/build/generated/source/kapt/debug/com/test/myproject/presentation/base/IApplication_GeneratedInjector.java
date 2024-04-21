package com.test.myproject.presentation.base;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = IApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface IApplication_GeneratedInjector {
  void injectIApplication(IApplication iApplication);
}
