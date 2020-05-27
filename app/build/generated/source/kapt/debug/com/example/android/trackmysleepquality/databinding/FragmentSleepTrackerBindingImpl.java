package com.example.android.trackmysleepquality.databinding;
import com.example.android.trackmysleepquality.R;
import com.example.android.trackmysleepquality.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSleepTrackerBindingImpl extends FragmentSleepTrackerBinding implements com.example.android.trackmysleepquality.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentSleepTrackerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSleepTrackerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.clearButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.startButton.setTag(null);
        this.stopButton.setTag(null);
        this.textview.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 1);
        mCallback3 = new com.example.android.trackmysleepquality.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.sleepTrackerViewModel == variableId) {
            setSleepTrackerViewModel((com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSleepTrackerViewModel(@Nullable com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel SleepTrackerViewModel) {
        this.mSleepTrackerViewModel = SleepTrackerViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.sleepTrackerViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSleepTrackerViewModelNightsString((androidx.lifecycle.LiveData<android.text.Spanned>) object, fieldId);
            case 1 :
                return onChangeSleepTrackerViewModelStartButtonVisible((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeSleepTrackerViewModelClearButtonVisible((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeSleepTrackerViewModelStopButtonVisible((androidx.lifecycle.LiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSleepTrackerViewModelNightsString(androidx.lifecycle.LiveData<android.text.Spanned> SleepTrackerViewModelNightsString, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSleepTrackerViewModelStartButtonVisible(androidx.lifecycle.LiveData<java.lang.Boolean> SleepTrackerViewModelStartButtonVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSleepTrackerViewModelClearButtonVisible(androidx.lifecycle.LiveData<java.lang.Boolean> SleepTrackerViewModelClearButtonVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSleepTrackerViewModelStopButtonVisible(androidx.lifecycle.LiveData<java.lang.Boolean> SleepTrackerViewModelStopButtonVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.Boolean sleepTrackerViewModelStopButtonVisibleGetValue = null;
        androidx.lifecycle.LiveData<android.text.Spanned> sleepTrackerViewModelNightsString = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> sleepTrackerViewModelStartButtonVisible = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStartButtonVisibleGetValue = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelClearButtonVisibleGetValue = false;
        androidx.lifecycle.LiveData<java.lang.Boolean> sleepTrackerViewModelClearButtonVisible = null;
        java.lang.Boolean sleepTrackerViewModelStartButtonVisibleGetValue = null;
        java.lang.Boolean sleepTrackerViewModelClearButtonVisibleGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStopButtonVisibleGetValue = false;
        android.text.Spanned sleepTrackerViewModelNightsStringGetValue = null;
        androidx.lifecycle.LiveData<java.lang.Boolean> sleepTrackerViewModelStopButtonVisible = null;
        com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (sleepTrackerViewModel != null) {
                        // read sleepTrackerViewModel.nightsString
                        sleepTrackerViewModelNightsString = sleepTrackerViewModel.getNightsString();
                    }
                    updateLiveDataRegistration(0, sleepTrackerViewModelNightsString);


                    if (sleepTrackerViewModelNightsString != null) {
                        // read sleepTrackerViewModel.nightsString.getValue()
                        sleepTrackerViewModelNightsStringGetValue = sleepTrackerViewModelNightsString.getValue();
                    }
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (sleepTrackerViewModel != null) {
                        // read sleepTrackerViewModel.startButtonVisible
                        sleepTrackerViewModelStartButtonVisible = sleepTrackerViewModel.getStartButtonVisible();
                    }
                    updateLiveDataRegistration(1, sleepTrackerViewModelStartButtonVisible);


                    if (sleepTrackerViewModelStartButtonVisible != null) {
                        // read sleepTrackerViewModel.startButtonVisible.getValue()
                        sleepTrackerViewModelStartButtonVisibleGetValue = sleepTrackerViewModelStartButtonVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModel.startButtonVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStartButtonVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModelStartButtonVisibleGetValue);
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (sleepTrackerViewModel != null) {
                        // read sleepTrackerViewModel.clearButtonVisible
                        sleepTrackerViewModelClearButtonVisible = sleepTrackerViewModel.getClearButtonVisible();
                    }
                    updateLiveDataRegistration(2, sleepTrackerViewModelClearButtonVisible);


                    if (sleepTrackerViewModelClearButtonVisible != null) {
                        // read sleepTrackerViewModel.clearButtonVisible.getValue()
                        sleepTrackerViewModelClearButtonVisibleGetValue = sleepTrackerViewModelClearButtonVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModel.clearButtonVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelClearButtonVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModelClearButtonVisibleGetValue);
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (sleepTrackerViewModel != null) {
                        // read sleepTrackerViewModel.stopButtonVisible
                        sleepTrackerViewModelStopButtonVisible = sleepTrackerViewModel.getStopButtonVisible();
                    }
                    updateLiveDataRegistration(3, sleepTrackerViewModelStopButtonVisible);


                    if (sleepTrackerViewModelStopButtonVisible != null) {
                        // read sleepTrackerViewModel.stopButtonVisible.getValue()
                        sleepTrackerViewModelStopButtonVisibleGetValue = sleepTrackerViewModelStopButtonVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModel.stopButtonVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStopButtonVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(sleepTrackerViewModelStopButtonVisibleGetValue);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.clearButton.setOnClickListener(mCallback3);
            this.startButton.setOnClickListener(mCallback1);
            this.stopButton.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.clearButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelClearButtonVisibleGetValue);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.startButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStartButtonVisibleGetValue);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.stopButton.setEnabled(androidxDatabindingViewDataBindingSafeUnboxSleepTrackerViewModelStopButtonVisibleGetValue);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textview, sleepTrackerViewModelNightsStringGetValue);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onStopTracking();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onStartTracking();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // sleepTrackerViewModel != null
                boolean sleepTrackerViewModelJavaLangObjectNull = false;
                // sleepTrackerViewModel
                com.example.android.trackmysleepquality.sleeptracker.SleepTrackerViewModel sleepTrackerViewModel = mSleepTrackerViewModel;



                sleepTrackerViewModelJavaLangObjectNull = (sleepTrackerViewModel) != (null);
                if (sleepTrackerViewModelJavaLangObjectNull) {


                    sleepTrackerViewModel.onClear();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): sleepTrackerViewModel.nightsString
        flag 1 (0x2L): sleepTrackerViewModel.startButtonVisible
        flag 2 (0x3L): sleepTrackerViewModel.clearButtonVisible
        flag 3 (0x4L): sleepTrackerViewModel.stopButtonVisible
        flag 4 (0x5L): sleepTrackerViewModel
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}