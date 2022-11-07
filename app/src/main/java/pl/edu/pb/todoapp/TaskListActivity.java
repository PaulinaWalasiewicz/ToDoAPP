package pl.edu.pb.todoapp;

public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected TaskListFragment createFragment() {return new TaskListFragment();}
}