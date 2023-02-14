/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author quentin.touze
 */
@Entity
@Table(name = "Compte_cpt")
@NamedQueries({
    @NamedQuery(name = "Comptecpt.findAll", query = "SELECT c FROM Comptecpt c"),
    @NamedQuery(name = "Comptecpt.findByCptPseudo", query = "SELECT c FROM Comptecpt c WHERE c.cptPseudo = :cptPseudo"),
    @NamedQuery(name = "Comptecpt.findByCptMdp", query = "SELECT c FROM Comptecpt c WHERE c.cptMdp = :cptMdp")})
public class Comptecpt implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "cpt_pseudo")
    private String cptPseudo;
    @Column(name = "cpt_mdp")
    private String cptMdp;

    public Comptecpt() {
    }

    public Comptecpt(String cptPseudo) {
        this.cptPseudo = cptPseudo;
    }

    public String getCptPseudo() {
        return cptPseudo;
    }

    public void setCptPseudo(String cptPseudo) {
        this.cptPseudo = cptPseudo;
    }

    public String getCptMdp() {
        return cptMdp;
    }

    public void setCptMdp(String cptMdp) {
        this.cptMdp = cptMdp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cptPseudo != null ? cptPseudo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comptecpt)) {
            return false;
        }
        Comptecpt other = (Comptecpt) object;
        if ((this.cptPseudo == null && other.cptPseudo != null) || (this.cptPseudo != null && !this.cptPseudo.equals(other.cptPseudo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Comptecpt[ cptPseudo=" + cptPseudo + " ]";
    }
    
}
