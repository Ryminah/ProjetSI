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
@Table(name = "Artiste_art")
@NamedQueries({
    @NamedQuery(name = "Artisteart.findAll", query = "SELECT a FROM Artisteart a"),
    @NamedQuery(name = "Artisteart.findByArtId", query = "SELECT a FROM Artisteart a WHERE a.artId = :artId"),
    @NamedQuery(name = "Artisteart.findByArtNom", query = "SELECT a FROM Artisteart a WHERE a.artNom = :artNom"),
    @NamedQuery(name = "Artisteart.findByArtPrenom", query = "SELECT a FROM Artisteart a WHERE a.artPrenom = :artPrenom"),
    @NamedQuery(name = "Artisteart.findByArtPseudo", query = "SELECT a FROM Artisteart a WHERE a.artPseudo = :artPseudo"),
    @NamedQuery(name = "Artisteart.findByArtVille", query = "SELECT a FROM Artisteart a WHERE a.artVille = :artVille"),
    @NamedQuery(name = "Artisteart.findByArtAge", query = "SELECT a FROM Artisteart a WHERE a.artAge = :artAge")})
public class Artisteart implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "art_id")
    private Integer artId;
    @Basic(optional = false)
    @Column(name = "art_nom")
    private String artNom;
    @Basic(optional = false)
    @Column(name = "art_prenom")
    private String artPrenom;
    @Basic(optional = false)
    @Column(name = "art_pseudo")
    private String artPseudo;
    @Basic(optional = false)
    @Column(name = "art_ville")
    private String artVille;
    @Basic(optional = false)
    @Column(name = "art_age")
    private int artAge;
    @JoinColumn(name = "grp_id", referencedColumnName = "grp_id")
    @ManyToOne(optional = false)
    private Groupegrp grpId;

    public Artisteart() {
    }

    public Artisteart(Integer artId) {
        this.artId = artId;
    }

    public Artisteart(Integer artId, String artNom, String artPrenom, String artPseudo, String artVille, int artAge) {
        this.artId = artId;
        this.artNom = artNom;
        this.artPrenom = artPrenom;
        this.artPseudo = artPseudo;
        this.artVille = artVille;
        this.artAge = artAge;
    }

    public Integer getArtId() {
        return artId;
    }

    public void setArtId(Integer artId) {
        this.artId = artId;
    }

    public String getArtNom() {
        return artNom;
    }

    public void setArtNom(String artNom) {
        this.artNom = artNom;
    }

    public String getArtPrenom() {
        return artPrenom;
    }

    public void setArtPrenom(String artPrenom) {
        this.artPrenom = artPrenom;
    }

    public String getArtPseudo() {
        return artPseudo;
    }

    public void setArtPseudo(String artPseudo) {
        this.artPseudo = artPseudo;
    }

    public String getArtVille() {
        return artVille;
    }

    public void setArtVille(String artVille) {
        this.artVille = artVille;
    }

    public int getArtAge() {
        return artAge;
    }

    public void setArtAge(int artAge) {
        this.artAge = artAge;
    }

    public Groupegrp getGrpId() {
        return grpId;
    }

    public void setGrpId(Groupegrp grpId) {
        this.grpId = grpId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (artId != null ? artId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Artisteart)) {
            return false;
        }
        Artisteart other = (Artisteart) object;
        if ((this.artId == null && other.artId != null) || (this.artId != null && !this.artId.equals(other.artId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "data.Artisteart[ artId=" + artId + " ]";
    }
    
}
