package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;

public abstract interface zzks
  extends IInterface
{
  public abstract void zza(Account paramAccount, int paramInt, zzkr paramzzkr)
    throws RemoteException;
  
  public static abstract class zza
    extends Binder
    implements zzks
  {
    public static zzks zzas(IBinder paramIBinder)
    {
      if (paramIBinder == null) {
        return null;
      }
      IInterface localIInterface = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
      if ((localIInterface != null) && ((localIInterface instanceof zzks))) {
        return (zzks)localIInterface;
      }
      return new zza(paramIBinder);
    }
    
    public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
      throws RemoteException
    {
      switch (paramInt1)
      {
      default: 
        return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
      case 1598968902: 
        paramParcel2.writeString("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
        return true;
      }
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
      if (paramParcel1.readInt() != 0) {}
      for (Account localAccount = (Account)Account.CREATOR.createFromParcel(paramParcel1);; localAccount = null)
      {
        zza(localAccount, paramParcel1.readInt(), zzkr.zza.zzar(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    }
    
    private static class zza
      implements zzks
    {
      private IBinder zzoo;
      
      zza(IBinder paramIBinder)
      {
        this.zzoo = paramIBinder;
      }
      
      public IBinder asBinder()
      {
        return this.zzoo;
      }
      
      public void zza(Account paramAccount, int paramInt, zzkr paramzzkr)
        throws RemoteException
      {
        Parcel localParcel1 = Parcel.obtain();
        Parcel localParcel2 = Parcel.obtain();
        for (;;)
        {
          try
          {
            localParcel1.writeInterfaceToken("com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService");
            if (paramAccount != null)
            {
              localParcel1.writeInt(1);
              paramAccount.writeToParcel(localParcel1, 0);
              localParcel1.writeInt(paramInt);
              if (paramzzkr != null)
              {
                paramAccount = paramzzkr.asBinder();
                localParcel1.writeStrongBinder(paramAccount);
                this.zzoo.transact(1, localParcel1, localParcel2, 0);
                localParcel2.readException();
              }
            }
            else
            {
              localParcel1.writeInt(0);
              continue;
            }
            paramAccount = null;
          }
          finally
          {
            localParcel2.recycle();
            localParcel1.recycle();
          }
        }
      }
    }
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/internal/zzks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */