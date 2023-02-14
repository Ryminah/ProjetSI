/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author quentin.touze
 */
@Entity
@Table(name = "Concert_con")
@NamedQueries({
    @NamedQuery(name = "Concertcon.findAll", query = "SELECT c FROM Concertcon c"),
    @NamedQuery(name = "Concertcon.findByConId", query = "SELECT c FROM Concertcon c WHERE c.conId = :conId"),
    @NamedQuery(name = "Concertcon.findByConDebut", query = "SELECT c FROM Concertcon c WHERE c.conDebut = :conDebut"),
    @NamedQuery(name = "Concertcon.findByConFin", query = "SELECT c FROM Concertcon c WHERE c.conFin = :conFin")})
public class Concertcon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "con_id")
    private Integer conId;
    @Column(name = "con_debut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date conDebut;
    @Column(name = "con_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date conFin;
    @JoinColumn(name = "grp_id", referencedColumnName = "grp_id")
    @ManyToOne(optional = false)
    private Groupegrp grpId;
    @JoinColumn(name = "soi_id", referencedColumnName = "soi_id")
    @ManyToOne(optional = false)
    private Soireesoi soiId;

    public Concertcon() {
    }

    public Concertcon(Integer conId) {
        this.conId = conId;
    }

    public Integer getConId() {
        return conId;
    }

    public void setConId(Integer conId) {
        this.conId = conId;
    }

    public Date getConDebut() {
        return conDebut;
    }

    public void setConDebut(Date conDebut) {
        this.conDebut = conDebut;
    }

    public Date getConFin() {
        return conFin;
    }

    public void setConFin(Date conFin) {
        this.conFin = conFin;
    }

    public Groupegrp getGrpId() {
        return grpId;
    }

    public void setGrpId(Groupegrp grpId) {
        this.grpId = grpId;
    }

    public Soireesoi getSoiId() {
        return soiId;
    }

    public void setSoiId(Soireesoi soiId) {
        this.soiId = soiId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conId != null ? conId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Concertcon)) {
            return false;
        }
        Concertcon other = (Concertcon) object;
        if ((this.conId == null && other.conId != null) || (this.conId != null && !this.conId.equals(other.conId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Concertcon[ conId=" + conId + " ]";
    }
    
}
