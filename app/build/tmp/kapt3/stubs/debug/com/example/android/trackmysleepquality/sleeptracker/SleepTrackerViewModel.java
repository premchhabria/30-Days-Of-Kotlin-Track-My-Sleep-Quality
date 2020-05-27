package com.example.android.trackmysleepquality.sleeptracker;

import java.lang.System;

/**
 * * ViewModel for SleepTrackerFragment.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010%\u001a\u00020&H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\u0006\u0010(\u001a\u00020&J\u0006\u0010)\u001a\u00020&J\u0013\u0010*\u001a\u0004\u0018\u00010\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\'J\b\u0010+\u001a\u00020&H\u0002J\u0019\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.J\u0006\u0010/\u001a\u00020&J\b\u00100\u001a\u00020&H\u0014J\u0006\u00101\u001a\u00020&J\u0006\u00102\u001a\u00020&J\u0019\u00103\u001a\u00020&2\u0006\u0010-\u001a\u00020\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010.R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\f\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b \u000e*\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00160\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R5\u0010\u0017\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00180\u0018 \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u00180\u0018\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0010R5\u0010\u001c\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0010R5\u0010\u001e\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\u000b0\u000b\u0018\u00010\r0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0010R\u0016\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00064"}, d2 = {"Lcom/example/android/trackmysleepquality/sleeptracker/SleepTrackerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;Landroid/app/Application;)V", "_navigateToSleepQuality", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/android/trackmysleepquality/database/SleepNight;", "_showSnackbarEvent", "", "clearButtonVisible", "Landroidx/lifecycle/LiveData;", "kotlin.jvm.PlatformType", "getClearButtonVisible", "()Landroidx/lifecycle/LiveData;", "getDatabase", "()Lcom/example/android/trackmysleepquality/database/SleepDatabaseDao;", "navigateToSleepQuality", "getNavigateToSleepQuality", "nights", "", "nightsString", "Landroid/text/Spanned;", "getNightsString", "showSnackBarEvent", "getShowSnackBarEvent", "startButtonVisible", "getStartButtonVisible", "stopButtonVisible", "getStopButtonVisible", "tonight", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/Job;", "clear", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doneNavigating", "doneShowingSnackbar", "getTonightFromDatabase", "initializeTonight", "insert", "night", "(Lcom/example/android/trackmysleepquality/database/SleepNight;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onClear", "onCleared", "onStartTracking", "onStopTracking", "update", "app_debug"})
public final class SleepTrackerViewModel extends androidx.lifecycle.AndroidViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> _navigateToSleepQuality = null;
    private kotlinx.coroutines.Job viewModelJob;
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    private androidx.lifecycle.MutableLiveData<com.example.android.trackmysleepquality.database.SleepNight> tonight;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.android.trackmysleepquality.database.SleepNight>> nights = null;
    private final androidx.lifecycle.LiveData<android.text.Spanned> nightsString = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> startButtonVisible = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> stopButtonVisible = null;
    private final androidx.lifecycle.LiveData<java.lang.Boolean> clearButtonVisible = null;
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _showSnackbarEvent;
    @org.jetbrains.annotations.NotNull()
    private final com.example.android.trackmysleepquality.database.SleepDatabaseDao database = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.android.trackmysleepquality.database.SleepNight> getNavigateToSleepQuality() {
        return null;
    }
    
    public final void doneNavigating() {
    }
    
    private final void initializeTonight() {
    }
    
    public final void onStartTracking() {
    }
    
    public final void onStopTracking() {
    }
    
    public final androidx.lifecycle.LiveData<android.text.Spanned> getNightsString() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clear(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p0) {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStartButtonVisible() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getStopButtonVisible() {
        return null;
    }
    
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getClearButtonVisible() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getShowSnackBarEvent() {
        return null;
    }
    
    public final void doneShowingSnackbar() {
    }
    
    public final void onClear() {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.android.trackmysleepquality.database.SleepDatabaseDao getDatabase() {
        return null;
    }
    
    public SleepTrackerViewModel(@org.jetbrains.annotations.NotNull()
    com.example.android.trackmysleepquality.database.SleepDatabaseDao database, @org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}