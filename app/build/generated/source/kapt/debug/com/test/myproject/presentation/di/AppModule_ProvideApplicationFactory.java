// Generated by Dagger (https://dagger.dev).
package com.test.myproject.presentation.di;

import android.content.Context;
import com.test.myproject.presentation.base.IApplication;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("dagger.hilt.android.qualifiers.ApplicationContext")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class AppModule_ProvideApplicationFactory implements Factory<IApplication> {
  private final AppModule module;

  private final Provider<Context> appProvider;

  public AppModule_ProvideApplicationFactory(AppModule module, Provider<Context> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public IApplication get() {
    return provideApplication(module, appProvider.get());
  }

  public static AppModule_ProvideApplicationFactory create(AppModule module,
      Provider<Context> appProvider) {
    return new AppModule_ProvideApplicationFactory(module, appProvider);
  }

  public static IApplication provideApplication(AppModule instance, Context app) {
    return Preconditions.checkNotNullFromProvides(instance.provideApplication(app));
  }
}
