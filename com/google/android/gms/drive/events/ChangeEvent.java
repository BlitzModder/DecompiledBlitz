package com.google.android.gms.drive.events;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.drive.DriveId;
import java.util.Locale;

public final class ChangeEvent
  implements SafeParcelable, ResourceEvent
{
  public static final Parcelable.Creator<ChangeEvent> CREATOR = new zza();
  final int mVersionCode;
  final DriveId zzamF;
  final int zzanB;
  
  ChangeEvent(int paramInt1, DriveId paramDriveId, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.zzamF = paramDriveId;
    this.zzanB = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public DriveId getDriveId()
  {
    return this.zzamF;
  }
  
  public int getType()
  {
    return 1;
  }
  
  public boolean hasBeenDeleted()
  {
    return (this.zzanB & 0x4) != 0;
  }
  
  public boolean hasContentChanged()
  {
    return (this.zzanB & 0x2) != 0;
  }
  
  public boolean hasMetadataChanged()
  {
    return (this.zzanB & 0x1) != 0;
  }
  
  public String toString()
  {
    return String.format(Locale.US, "ChangeEvent [id=%s,changeFlags=%x]", new Object[] { this.zzamF, Integer.valueOf(this.zzanB) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/drive/events/ChangeEvent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */