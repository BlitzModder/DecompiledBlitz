package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;

public class zzf
  implements Parcelable.Creator<ViewableItem>
{
  static void zza(ViewableItem paramViewableItem, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1, paramViewableItem.getVersionCode());
    zzb.zza(paramParcel, 2, paramViewableItem.zzCS(), false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public ViewableItem zzgi(Parcel paramParcel)
  {
    int j = zza.zzau(paramParcel);
    int i = 0;
    String[] arrayOfString = null;
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
        arrayOfString = zza.zzB(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new ViewableItem(i, arrayOfString);
  }
  
  public ViewableItem[] zzjk(int paramInt)
  {
    return new ViewableItem[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/nearby/sharing/zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */