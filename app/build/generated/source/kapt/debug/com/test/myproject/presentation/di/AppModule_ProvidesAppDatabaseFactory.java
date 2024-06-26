// Generated by Dagger (https://dagger.dev).
package com.test.myproject.presentation.di;

import android.content.Context;
import com.test.myproject.data.database.room.AppDatabase;
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
public final class AppModule_ProvidesAppDatabaseFactory implements Factory<AppDatabase> {
  private final AppModule module;

  private final Provider<Context> appProvider;

  public AppModule_ProvidesAppDatabaseFactory(AppModule module, Provider<Context> appProvider) {
    this.module = module;
    this.appProvider = appProvider;
  }

  @Override
  public AppDatabase get() {
    return providesAppDatabase(module, appProvider.get());
  }

  public static AppModule_ProvidesAppDatabaseFactory create(AppModule module,
      Provider<Context> appProvider) {
    return new AppModule_ProvidesAppDatabaseFactory(module, appProvider);
  }

  public static AppDatabase providesAppDatabase(AppModule instance, Context app) {
    return Preconditions.checkNotNullFromProvides(instance.providesAppDatabase(app));
  }
}
