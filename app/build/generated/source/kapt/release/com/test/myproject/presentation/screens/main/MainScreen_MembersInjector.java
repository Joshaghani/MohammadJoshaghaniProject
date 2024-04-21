// Generated by Dagger (https://dagger.dev).
package com.test.myproject.presentation.screens.main;

import com.test.myproject.presentation.base.BaseHandler;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class MainScreen_MembersInjector implements MembersInjector<MainScreen> {
  private final Provider<BaseHandler<MainScreenViewModel, MainScreenContract.Effect>> handlerProvider;

  public MainScreen_MembersInjector(
      Provider<BaseHandler<MainScreenViewModel, MainScreenContract.Effect>> handlerProvider) {
    this.handlerProvider = handlerProvider;
  }

  public static MembersInjector<MainScreen> create(
      Provider<BaseHandler<MainScreenViewModel, MainScreenContract.Effect>> handlerProvider) {
    return new MainScreen_MembersInjector(handlerProvider);
  }

  @Override
  public void injectMembers(MainScreen instance) {
    injectHandler(instance, handlerProvider.get());
  }

  @InjectedFieldSignature("com.test.myproject.presentation.screens.main.MainScreen.handler")
  public static void injectHandler(MainScreen instance,
      BaseHandler<MainScreenViewModel, MainScreenContract.Effect> handler) {
    instance.handler = handler;
  }
}