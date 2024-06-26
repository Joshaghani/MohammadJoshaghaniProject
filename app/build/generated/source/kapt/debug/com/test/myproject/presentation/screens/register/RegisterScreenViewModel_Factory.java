// Generated by Dagger (https://dagger.dev).
package com.test.myproject.presentation.screens.register;

import com.test.myproject.data.database.repository.RegisterRepository;
import com.test.myproject.data.managers.RegisterService;
import com.test.myproject.presentation.utilities.LoginState;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RegisterScreenViewModel_Factory implements Factory<RegisterScreenViewModel> {
  private final Provider<RegisterRepository> repositoryProvider;

  private final Provider<RegisterService> serviceProvider;

  private final Provider<LoginState> loginStateProvider;

  public RegisterScreenViewModel_Factory(Provider<RegisterRepository> repositoryProvider,
      Provider<RegisterService> serviceProvider, Provider<LoginState> loginStateProvider) {
    this.repositoryProvider = repositoryProvider;
    this.serviceProvider = serviceProvider;
    this.loginStateProvider = loginStateProvider;
  }

  @Override
  public RegisterScreenViewModel get() {
    RegisterScreenViewModel instance = newInstance(repositoryProvider.get(), serviceProvider.get());
    RegisterScreenViewModel_MembersInjector.injectLoginState(instance, loginStateProvider.get());
    return instance;
  }

  public static RegisterScreenViewModel_Factory create(
      Provider<RegisterRepository> repositoryProvider, Provider<RegisterService> serviceProvider,
      Provider<LoginState> loginStateProvider) {
    return new RegisterScreenViewModel_Factory(repositoryProvider, serviceProvider, loginStateProvider);
  }

  public static RegisterScreenViewModel newInstance(RegisterRepository repository,
      RegisterService service) {
    return new RegisterScreenViewModel(repository, service);
  }
}
