package io.fabric.sdk.android.services.concurrency;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DependsOn
{
  Class<?>[] value();
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/io/fabric/sdk/android/services/concurrency/DependsOn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */