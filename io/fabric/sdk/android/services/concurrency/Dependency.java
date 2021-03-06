package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;

public abstract interface Dependency<T>
{
  public abstract void addDependency(T paramT);
  
  public abstract boolean areDependenciesMet();
  
  public abstract Collection<T> getDependencies();
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/io/fabric/sdk/android/services/concurrency/Dependency.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */