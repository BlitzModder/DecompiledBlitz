package io.fabric.sdk.android.services.common;

import java.util.Map;

public abstract interface DeviceIdentifierProvider
{
  public abstract Map<IdManager.DeviceIdentifierType, String> getDeviceIdentifiers();
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/io/fabric/sdk/android/services/common/DeviceIdentifierProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */