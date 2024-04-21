// Generated by Dagger (https://dagger.dev).
package com.test.myproject.presentation.screens.main;

import com.test.myproject.presentation.utilities.LoginState;
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
public final class MainScreenViewModel_MembersInjector implements MembersInjector<MainScreenViewModel> {
  private final Provider<LoginState> loginStateProvider;

  public MainScreenViewModel_MembersInjector(Provider<LoginState> loginStateProvider) {
    this.loginStateProvider = loginStateProvider;
  }

  public static MembersInjector<MainScreenViewModel> create(
      Provider<LoginState> loginStateProvider) {
    return new MainScreenViewModel_MembersInjector(loginStateProvider);
  }

  @Override
  public void injectMembers(MainScreenViewModel instance) {
    injectLoginState(instance, loginStateProvider.get());
  }

  @InjectedFieldSignature("com.test.myproject.presentation.screens.main.MainScreenViewModel.loginState")
  public static void injectLoginState(MainScreenViewModel instance, LoginState loginState) {
    instance.loginState = loginState;
  }
}
