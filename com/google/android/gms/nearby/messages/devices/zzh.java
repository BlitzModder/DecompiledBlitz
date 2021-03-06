package com.google.android.gms.nearby.messages.devices;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzh
  implements Parcelable.Creator<NearbyDeviceId>
{
  static void zza(NearbyDeviceId paramNearbyDeviceId, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramNearbyDeviceId.getType());
    zzb.zzc(paramParcel, 1000, paramNearbyDeviceId.mVersionCode);
    zzb.zza(paramParcel, 2, paramNearbyDeviceId.zzaXb, false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public NearbyDeviceId zzfW(Parcel paramParcel)
  {
    int j = 0;
    int k = zza.zzau(paramParcel);
    byte[] arrayOfByte = null;
    int i = 0;
    while (paramParcel.dataPosition() < k)
    {
      int m = zza.zzat(paramParcel);
      switch (zza.zzcc(m))
      {
      default: 
        zza.zzb(paramParcel, m);
        break;
      case 1: 
        j = zza.zzg(paramParcel, m);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, m);
        break;
      case 2: 
        arrayOfByte = zza.zzs(paramParcel, m);
      }
    }
    if (paramParcel.dataPosition() != k) {
      throw new zza.zza("Overread allowed size end=" + k, paramParcel);
    }
    return new NearbyDeviceId(i, j, arrayOfByte);
  }
  
  public NearbyDeviceId[] zziY(int paramInt)
  {
    return new NearbyDeviceId[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/nearby/messages/devices/zzh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */