package com.example.android.trackmysleepquality.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel;

public abstract class FragmentSleepTrackerBinding extends ViewDataBinding {
  @NonNull
  public final Button clearButton;

  @NonNull
  public final Button startButton;

  @NonNull
  public final Button stopButton;

  @NonNull
  public final TextView textview;

  @Bindable
  protected SleepTrackerViewModel mSleepTrackerViewModel;

  protected FragmentSleepTrackerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button clearButton, Button startButton, Button stopButton,
      TextView textview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.clearButton = clearButton;
    this.startButton = startButton;
    this.stopButton = stopButton;
    this.textview = textview;
  }

  public abstract void setSleepTrackerViewModel(@Nullable SleepTrackerViewModel sleepTrackerViewModel);

  @Nullable
  public SleepTrackerViewModel getSleepTrackerViewModel() {
    return mSleepTrackerViewModel;
  }

  @NonNull
  public static FragmentSleepTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSleepTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSleepTrackerBinding>inflate(inflater, com.example.android.trackmysleepquality.R.layout.fragment_sleep_tracker, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentSleepTrackerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentSleepTrackerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentSleepTrackerBinding>inflate(inflater, com.example.android.trackmysleepquality.R.layout.fragment_sleep_tracker, null, false, component);
  }

  public static FragmentSleepTrackerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentSleepTrackerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentSleepTrackerBinding)bind(component, view, com.example.android.trackmysleepquality.R.layout.fragment_sleep_tracker);
  }
}
