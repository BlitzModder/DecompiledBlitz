package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzc
  implements Parcelable.Creator<AddListenerRequest>
{
  static void zza(AddListenerRequest paramAddListenerRequest, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramAddListenerRequest.mVersionCode);
    zzb.zza(paramParcel, 2, paramAddListenerRequest.zzGB(), false);
    zzb.zza(paramParcel, 3, paramAddListenerRequest.zzbmx, paramInt, false);
    zzb.zza(paramParcel, 4, paramAddListenerRequest.zzbmy, false);
    zzb.zza(paramParcel, 5, paramAddListenerRequest.zzbmz, false);
    zzb.zzI(paramParcel, i);
  }
  
  public AddListenerRequest zzhM(Parcel paramParcel)
  {
    String str1 = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String str2 = null;
    IntentFilter[] arrayOfIntentFilter = null;
    IBinder localIBinder = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzcc(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        localIBinder = zza.zzq(paramParcel, k);
        break;
      case 3: 
        arrayOfIntentFilter = (IntentFilter[])zza.zzb(paramParcel, k, IntentFilter.CREATOR);
        break;
      case 4: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 5: 
        str1 = zza.zzp(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new AddListenerRequest(i, localIBinder, arrayOfIntentFilter, str2, str1);
  }
  
  public AddListenerRequest[] zzlk(int paramInt)
  {
    return new AddListenerRequest[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/wearable/internal/zzc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */