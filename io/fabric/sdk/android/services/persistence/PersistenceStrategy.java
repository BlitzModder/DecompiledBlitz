package io.fabric.sdk.android.services.persistence;

public abstract interface PersistenceStrategy<T>
{
  public abstract void clear();
  
  public abstract T restore();
  
  public abstract void save(T paramT);
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/io/fabric/sdk/android/services/persistence/PersistenceStrategy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */