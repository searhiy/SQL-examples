package examples.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by serhii on 26.01.15.
 */
@Entity
@Table(name = "groups")
public class Group {

    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long groupId;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name="group_client_mapping", joinColumns={@JoinColumn(name="group_id")}, inverseJoinColumns={@JoinColumn(name="client_id")})
    private List<Client> clients;

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
