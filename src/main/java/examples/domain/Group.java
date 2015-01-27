package examples.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by serhii on 26.01.15.
 * Important information for PostgreSQL and Oracle databases
 * http://softwarecave.org/2014/08/02/primary-key-generators-in-jpa/
 *
 */
@Entity
@Table(name = "groups")
public class Group {

    @Id
    @Column(name = "group_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long groupId;

    @Column(name = "name")
    private String name;

    @ManyToMany
    @JoinTable(name="group_client_mapping", joinColumns={@JoinColumn(name="group_id")}, inverseJoinColumns={@JoinColumn(name="client_id")})
    private Set<Client> clients = new HashSet<>();

    public Group(){
        ;
    }

    public Group(Builder builder){
        this.name = builder.name;
    }

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

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public void addClient(Client client){
        clients.add(client);
    }

    public static class Builder {
        private String name;
        public Builder setName(String name) {
            this.name = name;
            return this;
        }
        public Group build() {
            return new Group(this);
        }
    }
}
