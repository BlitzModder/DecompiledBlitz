package com.google.android.gms.location.places.personalized;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import java.util.ArrayList;

public class zze
  implements Parcelable.Creator<PlaceUserData>
{
  static void zza(PlaceUserData paramPlaceUserData, Parcel paramParcel, int paramInt)
  {
    paramInt = zzb.zzav(paramParcel);
    zzb.zza(paramParcel, 1, paramPlaceUserData.zzyQ(), false);
    zzb.zzc(paramParcel, 1000, paramPlaceUserData.mVersionCode);
    zzb.zza(paramParcel, 2, paramPlaceUserData.getPlaceId(), false);
    zzb.zzc(paramParcel, 6, paramPlaceUserData.zzyR(), false);
    zzb.zzI(paramParcel, paramInt);
  }
  
  public PlaceUserData zzfj(Parcel paramParcel)
  {
    ArrayList localArrayList = null;
    int j = zza.zzau(paramParcel);
    int i = 0;
    String str2 = null;
    String str1 = null;
    while (paramParcel.dataPosition() < j)
    {
      int k = zza.zzat(paramParcel);
      switch (zza.zzcc(k))
      {
      default: 
        zza.zzb(paramParcel, k);
        break;
      case 1: 
        str1 = zza.zzp(paramParcel, k);
        break;
      case 1000: 
        i = zza.zzg(paramParcel, k);
        break;
      case 2: 
        str2 = zza.zzp(paramParcel, k);
        break;
      case 6: 
        localArrayList = zza.zzc(paramParcel, k, PlaceAlias.CREATOR);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new PlaceUserData(i, str1, str2, localArrayList);
  }
  
  public PlaceUserData[] zzhU(int paramInt)
  {
    return new PlaceUserData[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/location/places/personalized/zze.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */