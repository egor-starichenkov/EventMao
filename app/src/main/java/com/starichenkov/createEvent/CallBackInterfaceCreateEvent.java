package com.starichenkov.createEvent;

import android.location.Address;

import com.google.android.gms.maps.model.LatLng;
import com.starichenkov.RoomDB.Events;

public interface CallBackInterfaceCreateEvent {

    void OpenPlaceAutocomplete();
    void SetEventAddress(Address address, LatLng latLng);

    void createEvent(Events events);

    void getEvent();
}
