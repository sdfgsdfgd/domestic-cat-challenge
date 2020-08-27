package au.com.domestic.cat.kaantest.bindings;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.databinding.BindingAdapter;
import androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange;
import androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextSubmit;

public class SearchViewBindingAdapter {

    @BindingAdapter(value = {"android:onQueryTextSubmit", "android:onQueryTextChange"},
            requireAll = false)
    public static void setOnQueryTextListener(
            SearchView view,
            @Nullable OnQueryTextSubmit submit,
            @Nullable OnQueryTextChange change) {
        if (submit == null && change == null) {
            view.setOnQueryTextListener(null);
        } else {
            view.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    if (submit != null) {
                        return submit.onQueryTextSubmit(query);
                    } else {
                        return false;
                    }
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    if (change != null) {
                        return change.onQueryTextChange(newText);
                    } else {
                        return false;
                    }
                }
            });
        }
    }
}
