package pl.edu.pb.todoapp;

import java.util.UUID;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected TaskFragment createFragment() {
        UUID taskId = (UUID) getIntent().getSerializableExtra(TaskListFragment.KEY_EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }
}