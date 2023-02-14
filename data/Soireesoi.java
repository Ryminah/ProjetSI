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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author quentin.touze
 */
@Entity
@Table(name = "Soiree_soi")
@NamedQueries({
    @NamedQuery(name = "Soireesoi.findAll", query = "SELECT s FROM Soireesoi s"),
    @NamedQuery(name = "Soireesoi.findBySoiId", query = "SELECT s FROM Soireesoi s WHERE s.soiId = :soiId"),
    @NamedQuery(name = "Soireesoi.findBySoiNom", query = "SELECT s FROM Soireesoi s WHERE s.soiNom = :soiNom")})
public class Soireesoi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "soi_id")
    private Integer soiId;
    @Basic(optional = false)
    @Column(name = "soi_nom")
    private String soiNom;
    @JoinColumn(name = "sal_id", referencedColumnName = "sal_id")
    @ManyToOne(optional = false)
    private Sallesal salId;
    @OneToMany(mappedBy = "soiId")
    private Set<Billetbil> billetbilSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "soiId")
    private Set<Concertcon> concertconSet;

    public Soireesoi() {
    }

    public Soireesoi(Integer soiId) {
        this.soiId = soiId;
    }

    public Soireesoi(Integer soiId, String soiNom) {
        this.soiId = soiId;
        this.soiNom = soiNom;
    }

    public Integer getSoiId() {
        return soiId;
    }

    public void setSoiId(Integer soiId) {
        this.soiId = soiId;
    }

    public String getSoiNom() {
        return soiNom;
    }

    public void setSoiNom(String soiNom) {
        this.soiNom = soiNom;
    }

    public Sallesal getSalId() {
        return salId;
    }

    public void setSalId(Sallesal salId) {
        this.salId = salId;
    }

    public Set<Billetbil> getBilletbilSet() {
        return billetbilSet;
    }

    public void setBilletbilSet(Set<Billetbil> billetbilSet) {
        this.billetbilSet = billetbilSet;
    }

    public Set<Concertcon> getConcertconSet() {
        return concertconSet;
    }

    public void setConcertconSet(Set<Concertcon> concertconSet) {
        this.concertconSet = concertconSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (soiId != null ? soiId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Soireesoi)) {
            return false;
        }
        Soireesoi other = (Soireesoi) object;
        if ((this.soiId == null && other.soiId != null) || (this.soiId != null && !this.soiId.equals(other.soiId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Soireesoi[ soiId=" + soiId + " ]";
    }
    
}
