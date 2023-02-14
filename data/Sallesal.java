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
@Table(name = "Salle_sal")
@NamedQueries({
    @NamedQuery(name = "Sallesal.findAll", query = "SELECT s FROM Sallesal s"),
    @NamedQuery(name = "Sallesal.findBySalId", query = "SELECT s FROM Sallesal s WHERE s.salId = :salId"),
    @NamedQuery(name = "Sallesal.findBySalNom", query = "SELECT s FROM Sallesal s WHERE s.salNom = :salNom"),
    @NamedQuery(name = "Sallesal.findBySalAdresse", query = "SELECT s FROM Sallesal s WHERE s.salAdresse = :salAdresse"),
    @NamedQuery(name = "Sallesal.findBySalCapacite", query = "SELECT s FROM Sallesal s WHERE s.salCapacite = :salCapacite"),
    @NamedQuery(name = "Sallesal.findBySalGestion", query = "SELECT s FROM Sallesal s WHERE s.salGestion = :salGestion"),
    @NamedQuery(name = "Sallesal.findBySalAsso", query = "SELECT s FROM Sallesal s WHERE s.salAsso = :salAsso"),
    @NamedQuery(name = "Sallesal.findBySalPresident", query = "SELECT s FROM Sallesal s WHERE s.salPresident = :salPresident")})
public class Sallesal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "sal_id")
    private Integer salId;
    @Basic(optional = false)
    @Column(name = "sal_nom")
    private String salNom;
    @Basic(optional = false)
    @Column(name = "sal_adresse")
    private String salAdresse;
    @Basic(optional = false)
    @Column(name = "sal_capacite")
    private int salCapacite;
    @Column(name = "sal_gestion")
    private String salGestion;
    @Column(name = "sal_asso")
    private String salAsso;
    @Column(name = "sal_president")
    private String salPresident;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "salId")
    private Set<Soireesoi> soireesoiSet;

    public Sallesal() {
    }

    public Sallesal(Integer salId) {
        this.salId = salId;
    }

    public Sallesal(Integer salId, String salNom, String salAdresse, int salCapacite) {
        this.salId = salId;
        this.salNom = salNom;
        this.salAdresse = salAdresse;
        this.salCapacite = salCapacite;
    }

    public Integer getSalId() {
        return salId;
    }

    public void setSalId(Integer salId) {
        this.salId = salId;
    }

    public String getSalNom() {
        return salNom;
    }

    public void setSalNom(String salNom) {
        this.salNom = salNom;
    }

    public String getSalAdresse() {
        return salAdresse;
    }

    public void setSalAdresse(String salAdresse) {
        this.salAdresse = salAdresse;
    }

    public int getSalCapacite() {
        return salCapacite;
    }

    public void setSalCapacite(int salCapacite) {
        this.salCapacite = salCapacite;
    }

    public String getSalGestion() {
        return salGestion;
    }

    public void setSalGestion(String salGestion) {
        this.salGestion = salGestion;
    }

    public String getSalAsso() {
        return salAsso;
    }

    public void setSalAsso(String salAsso) {
        this.salAsso = salAsso;
    }

    public String getSalPresident() {
        return salPresident;
    }

    public void setSalPresident(String salPresident) {
        this.salPresident = salPresident;
    }

    public Set<Soireesoi> getSoireesoiSet() {
        return soireesoiSet;
    }

    public void setSoireesoiSet(Set<Soireesoi> soireesoiSet) {
        this.soireesoiSet = soireesoiSet;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (salId != null ? salId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sallesal)) {
            return false;
        }
        Sallesal other = (Sallesal) object;
        if ((this.salId == null && other.salId != null) || (this.salId != null && !this.salId.equals(other.salId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Sallesal[ salId=" + salId + " ]";
    }
    
}
