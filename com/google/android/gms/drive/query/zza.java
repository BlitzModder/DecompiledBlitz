package com.google.android.gms.drive.query;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza.zza;
import com.google.android.gms.common.internal.safeparcel.zzb;
import com.google.android.gms.drive.DriveSpace;
import com.google.android.gms.drive.query.internal.LogicalFilter;
import java.util.ArrayList;

public class zza
  implements Parcelable.Creator<Query>
{
  static void zza(Query paramQuery, Parcel paramParcel, int paramInt)
  {
    int i = zzb.zzav(paramParcel);
    zzb.zzc(paramParcel, 1000, paramQuery.mVersionCode);
    zzb.zza(paramParcel, 1, paramQuery.zzarP, paramInt, false);
    zzb.zza(paramParcel, 3, paramQuery.zzarQ, false);
    zzb.zza(paramParcel, 4, paramQuery.zzarR, paramInt, false);
    zzb.zzb(paramParcel, 5, paramQuery.zzarS, false);
    zzb.zza(paramParcel, 6, paramQuery.zzarT);
    zzb.zzc(paramParcel, 7, paramQuery.zzanF, false);
    zzb.zza(paramParcel, 8, paramQuery.zzapH);
    zzb.zzI(paramParcel, i);
  }
  
  public Query zzcf(Parcel paramParcel)
  {
    boolean bool1 = false;
    ArrayList localArrayList1 = null;
    int j = com.google.android.gms.common.internal.safeparcel.zza.zzau(paramParcel);
    boolean bool2 = false;
    ArrayList localArrayList2 = null;
    SortOrder localSortOrder = null;
    String str = null;
    LogicalFilter localLogicalFilter = null;
    int i = 0;
    while (paramParcel.dataPosition() < j)
    {
      int k = com.google.android.gms.common.internal.safeparcel.zza.zzat(paramParcel);
      switch (com.google.android.gms.common.internal.safeparcel.zza.zzcc(k))
      {
      default: 
        com.google.android.gms.common.internal.safeparcel.zza.zzb(paramParcel, k);
        break;
      case 1000: 
        i = com.google.android.gms.common.internal.safeparcel.zza.zzg(paramParcel, k);
        break;
      case 1: 
        localLogicalFilter = (LogicalFilter)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, LogicalFilter.CREATOR);
        break;
      case 3: 
        str = com.google.android.gms.common.internal.safeparcel.zza.zzp(paramParcel, k);
        break;
      case 4: 
        localSortOrder = (SortOrder)com.google.android.gms.common.internal.safeparcel.zza.zza(paramParcel, k, SortOrder.CREATOR);
        break;
      case 5: 
        localArrayList2 = com.google.android.gms.common.internal.safeparcel.zza.zzD(paramParcel, k);
        break;
      case 6: 
        bool2 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
        break;
      case 7: 
        localArrayList1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k, DriveSpace.CREATOR);
        break;
      case 8: 
        bool1 = com.google.android.gms.common.internal.safeparcel.zza.zzc(paramParcel, k);
      }
    }
    if (paramParcel.dataPosition() != j) {
      throw new zza.zza("Overread allowed size end=" + j, paramParcel);
    }
    return new Query(i, localLogicalFilter, str, localSortOrder, localArrayList2, bool2, localArrayList1, bool1);
  }
  
  public Query[] zzea(int paramInt)
  {
    return new Query[paramInt];
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/drive/query/zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */