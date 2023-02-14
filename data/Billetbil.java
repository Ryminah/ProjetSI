/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.Serializable;
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

/**
 *
 * @author quentin.touze
 */
@Entity
@Table(name = "Billet_bil")
@NamedQueries({
    @NamedQuery(name = "Billetbil.findAll", query = "SELECT b FROM Billetbil b"),
    @NamedQuery(name = "Billetbil.findByBilId", query = "SELECT b FROM Billetbil b WHERE b.bilId = :bilId"),
    @NamedQuery(name = "Billetbil.findByBilNom", query = "SELECT b FROM Billetbil b WHERE b.bilNom = :bilNom"),
    @NamedQuery(name = "Billetbil.findByBilPrenom", query = "SELECT b FROM Billetbil b WHERE b.bilPrenom = :bilPrenom"),
    @NamedQuery(name = "Billetbil.findByBilletbilcol", query = "SELECT b FROM Billetbil b WHERE b.billetbilcol = :billetbilcol")})
public class Billetbil implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "bil_id")
    private Integer bilId;
    @Basic(optional = false)
    @Column(name = "bil_nom")
    private String bilNom;
    @Basic(optional = false)
    @Column(name = "bil_prenom")
    private String bilPrenom;
    @Column(name = "Billet_bilcol")
    private String billetbilcol;
    @JoinColumn(name = "soi_id", referencedColumnName = "soi_id")
    @ManyToOne
    private Soireesoi soiId;

    public Billetbil() {
    }

    public Billetbil(Integer bilId) {
        this.bilId = bilId;
    }

    public Billetbil(Integer bilId, String bilNom, String bilPrenom) {
        this.bilId = bilId;
        this.bilNom = bilNom;
        this.bilPrenom = bilPrenom;
    }

    public Integer getBilId() {
        return bilId;
    }

    public void setBilId(Integer bilId) {
        this.bilId = bilId;
    }

    public String getBilNom() {
        return bilNom;
    }

    public void setBilNom(String bilNom) {
        this.bilNom = bilNom;
    }

    public String getBilPrenom() {
        return bilPrenom;
    }

    public void setBilPrenom(String bilPrenom) {
        this.bilPrenom = bilPrenom;
    }

    public String getBilletbilcol() {
        return billetbilcol;
    }

    public void setBilletbilcol(String billetbilcol) {
        this.billetbilcol = billetbilcol;
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
        hash += (bilId != null ? bilId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Billetbil)) {
            return false;
        }
        Billetbil other = (Billetbil) object;
        if ((this.bilId == null && other.bilId != null) || (this.bilId != null && !this.bilId.equals(other.bilId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Billetbil[ bilId=" + bilId + " ]";
    }
    
}
