/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author quentin.touze
 */
@Entity
@Table(name = "Groupe_grp")
@NamedQueries({
    @NamedQuery(name = "Groupegrp.findAll", query = "SELECT g FROM Groupegrp g"),
    @NamedQuery(name = "Groupegrp.findByGrpId", query = "SELECT g FROM Groupegrp g WHERE g.grpId = :grpId"),
    @NamedQuery(name = "Groupegrp.findByGrpNom", query = "SELECT g FROM Groupegrp g WHERE g.grpNom = :grpNom")})
public class Groupegrp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "grp_id")
    private Integer grpId;
    @Column(name = "grp_nom")
    private String grpNom;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grpId")
    private Set<Concertcon> concertconSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "grpId")
    private Set<Artisteart> artisteartSet;

    public Groupegrp() {
    }

    public Groupegrp(Integer grpId) {
        this.grpId = grpId;
    }

    public Integer getGrpId() {
        return grpId;
    }

    public void setGrpId(Integer grpId) {
        this.grpId = grpId;
    }

    public String getGrpNom() {
        return grpNom;
    }

    public void setGrpNom(String grpNom) {
        this.grpNom = grpNom;
    }

    public Set<Concertcon> getConcertconSet() {
        return concertconSet;
    }

    public void setConcertconSet(Set<Concertcon> concertconSet) {
        this.concertconSet = concertconSet;
    }

    public Set<Artisteart> getArtisteartSet() {
        return artisteartSet;
    }

    public void setArtisteartSet(Set<Artisteart> artisteartSet) {
        this.artisteartSet = artisteartSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (grpId != null ? grpId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Groupegrp)) {
            return false;
        }
        Groupegrp other = (Groupegrp) object;
        if ((this.grpId == null && other.grpId != null) || (this.grpId != null && !this.grpId.equals(other.grpId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Groupegrp[ grpId=" + grpId + " ]";
    }
    
}
