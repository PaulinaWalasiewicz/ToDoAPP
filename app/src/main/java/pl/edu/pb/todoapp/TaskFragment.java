package pl.edu.pb.todoapp;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

public class TaskFragment extends Fragment {
    protected EditText nameField;
    protected Button dateButton;
    protected CheckBox doneCheckBox;
    public TaskFragment() {
        super(R.layout.fragment_task);
    }
    @Override
    public void onCreate(Bundle savedB){//creating new Task object
        super.onCreate(savedB);
         Task task = new Task();

        nameField = getView().findViewById(R.id.task_name);
        nameField.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s,int start,int count,int after){

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                task.setName(s.toString());
            }
            @Override
            public void afterTextChanged(Editable s){

            }
        });
        dateButton.setText(task.getDate().toString());
        dateButton.setEnabled(false);
        doneCheckBox.setChecked(task.isDone());
        doneCheckBox.setOnCheckedChangeListener(((buttonView, isChecked) -> task.setDone(isChecked)));
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup cointainer, Bundle savedInstance){
        View view = inflater.inflate(R.layout.fragment_task,cointainer,false);
        return view;
    }


}
