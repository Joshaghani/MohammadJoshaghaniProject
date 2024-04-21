// Generated by Dagger (https://dagger.dev).
package com.test.myproject.presentation.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import io.ktor.client.HttpClient;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvidesApiKtorFactory implements Factory<HttpClient> {
  private final AppModule module;

  public AppModule_ProvidesApiKtorFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public HttpClient get() {
    return providesApiKtor(module);
  }

  public static AppModule_ProvidesApiKtorFactory create(AppModule module) {
    return new AppModule_ProvidesApiKtorFactory(module);
  }

  public static HttpClient providesApiKtor(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesApiKtor());
  }
}