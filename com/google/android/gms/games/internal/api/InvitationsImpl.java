package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Invitations.LoadInvitationsResult;
import com.google.android.gms.games.multiplayer.OnInvitationReceivedListener;

public final class InvitationsImpl
  implements Invitations
{
  public Intent getInvitationInboxIntent(GoogleApiClient paramGoogleApiClient)
  {
    return Games.zzf(paramGoogleApiClient).zzvY();
  }
  
  public PendingResult<Invitations.LoadInvitationsResult> loadInvitations(GoogleApiClient paramGoogleApiClient)
  {
    return loadInvitations(paramGoogleApiClient, 0);
  }
  
  public PendingResult<Invitations.LoadInvitationsResult> loadInvitations(GoogleApiClient paramGoogleApiClient, final int paramInt)
  {
    paramGoogleApiClient.zza(new LoadInvitationsImpl(paramGoogleApiClient, paramInt)
    {
      protected void zza(GamesClientImpl paramAnonymousGamesClientImpl)
        throws RemoteException
      {
        paramAnonymousGamesClientImpl.zza(this, paramInt);
      }
    });
  }
  
  public void registerInvitationListener(GoogleApiClient paramGoogleApiClient, OnInvitationReceivedListener paramOnInvitationReceivedListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zza(paramGoogleApiClient.zzq(paramOnInvitationReceivedListener));
    }
  }
  
  public void unregisterInvitationListener(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = Games.zzb(paramGoogleApiClient, false);
    if (paramGoogleApiClient != null) {
      paramGoogleApiClient.zzvZ();
    }
  }
  
  private static abstract class LoadInvitationsImpl
    extends Games.BaseGamesApiMethodImpl<Invitations.LoadInvitationsResult>
  {
    private LoadInvitationsImpl(GoogleApiClient paramGoogleApiClient)
    {
      super();
    }
    
    public Invitations.LoadInvitationsResult zzai(final Status paramStatus)
    {
      new Invitations.LoadInvitationsResult()
      {
        public InvitationBuffer getInvitations()
        {
          return new InvitationBuffer(DataHolder.zzbJ(14));
        }
        
        public Status getStatus()
        {
          return paramStatus;
        }
        
        public void release() {}
      };
    }
  }
}


/* Location:              /Users/subdiox/Downloads/dex2jar-2.0/net.wargaming.wot.blitz-dex2jar.jar!/com/google/android/gms/games/internal/api/InvitationsImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */