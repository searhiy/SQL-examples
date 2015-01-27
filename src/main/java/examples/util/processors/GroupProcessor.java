package examples.util.processors;

import examples.domain.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 26.01.15.
 */
public class GroupProcessor implements DataProcessor{
    private List<Group> groups = new ArrayList<>();
    @Override
    public void processData(String[] data) {
        Group group = new Group.Builder().
                setName(data[0]).
                build();
        groups.add(group);
    }

    @Override
    public List<?> getData() {
        return groups;
    }
}
