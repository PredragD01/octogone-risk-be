package com.octagone.risk.risk.entities;

/*
    Created by: Predrag
    Date: 04.11.2021
*/

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.octagone.risk.risk.enums.Custodio;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;

    @Column
    private int custodia;

    @Column
    private String  custodio;

    @Column
    private String estado_de_la_cuenta;

    @Column
    @JsonIgnore
    private int canal_distribution;

    @Column
    private String value_corridor;

    @Column
    private int nu_license;

    @Column
    private Boolean cliente_es_PEP;

    @Column
    private Boolean world_check;

    @Column
    private Boolean lista_ley;

    @Column
    private Boolean proveedor;

    @Column
    private Boolean ong;

    @Column
    private Boolean related_shareholder;

    @Column
    private Boolean correspondent;

    @Column
    private Boolean high_vol_operation;

    @Column
    private Boolean money_laund;

    @Column
    private Boolean additional_act;

    @Column
    private Boolean smv;

    @Column
    @JsonIgnore
    private int client_type;

    @Column
    @JsonIgnore
    private int legal_nature;

    @Column
    @JsonIgnore
    private int country_origin;

    @Column
    @JsonIgnore
    private int country_of_res;

    @Column
    @JsonIgnore
    private int country_of_nat;

    @Column
    @JsonIgnore
    private int country_of_inc;

    @Column
    @JsonIgnore
    private int country_opera;

    @Column
    @JsonIgnore
    private int economic_act;

    @Column
    @JsonIgnore
    private int nu_ann_tran;

    @Column
    @JsonIgnore
    private int ann_tran_ammount;

    @Column
    @JsonIgnore
    private int estimated_equity;

    @Column
    @JsonIgnore
    private int mandate;

    //relations

    @JoinColumn(name = "ann_tran_ammount", insertable=false, updatable=false)
    @OneToOne()
    private AnnualTransactionAmount annualTransactionAmount;

    @JoinColumn(name = "canal_distribution", insertable=false, updatable=false)
    @OneToOne()
    private ChanelDistribution chanelDistribution;

    @JoinColumn(name = "client_type", insertable=false, updatable=false)
    @OneToOne()
    private TypeOfClient typeOfClient;

    @JoinColumn(name = "country_of_res", insertable=false, updatable=false)
    @OneToOne()
    private Pais countryOfRes;

    @JoinColumn(name = "country_of_inc", insertable=false, updatable=false)
    @OneToOne()
    private Pais countryOfInc;

    @JoinColumn(name = "country_of_nat", insertable=false, updatable=false)
    @OneToOne()
    private Pais countryOfNat;

    @JoinColumn(name = "country_origin", insertable=false, updatable=false)
    @OneToOne()
    private Pais countryOrigin;

    @JoinColumn(name = "country_opera", insertable=false, updatable=false)
    @OneToOne()
    private Pais countryOpera;

    @JoinColumn(name = "economic_act", insertable=false, updatable=false)
    @OneToOne()
    private ActividadEconomica economicAct;

    @JoinColumn(name = "estimated_equity", insertable=false, updatable=false)
    @OneToOne()
    private EstimatedEquity estimatedEquity;

    @JoinColumn(name = "legal_nature", insertable=false, updatable=false)
    @OneToOne()
    private NaturalezaJurdica naturalezaJurdica;


    @JoinColumn(name = "nu_ann_tran", insertable=false, updatable=false)
    @OneToOne()
    private NumberOfYearTransactions numberOfYearTransactions;

    @JoinColumn(name = "mandate", insertable=false, updatable=false)
    @OneToOne()
    private Products products;


    //getters and setters


    public int getCountry_opera() {
        return country_opera;
    }

    public void setCountry_opera(int country_opera) {
        this.country_opera = country_opera;
    }

    public Pais getCountryOpera() {
        return countryOpera;
    }

    public void setCountryOpera(Pais countryOpera) {
        this.countryOpera = countryOpera;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Pais getCountryOfInc() {
        return countryOfInc;
    }

    public void setCountryOfInc(Pais countryOfInc) {
        this.countryOfInc = countryOfInc;
    }

    public Pais getCountryOfNat() {
        return countryOfNat;
    }

    public void setCountryOfNat(Pais countryOfNat) {
        this.countryOfNat = countryOfNat;
    }

    public Pais getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(Pais countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public ActividadEconomica getEconomicAct() {
        return economicAct;
    }

    public void setEconomicAct(ActividadEconomica economicAct) {
        this.economicAct = economicAct;
    }

    public EstimatedEquity getEstimatedEquity() {
        return estimatedEquity;
    }

    public void setEstimatedEquity(EstimatedEquity estimatedEquity) {
        this.estimatedEquity = estimatedEquity;
    }

    public NaturalezaJurdica getNaturalezaJurdica() {
        return naturalezaJurdica;
    }

    public void setNaturalezaJurdica(NaturalezaJurdica naturalezaJurdica) {
        this.naturalezaJurdica = naturalezaJurdica;
    }

    public NumberOfYearTransactions getNumberOfYearTransactions() {
        return numberOfYearTransactions;
    }

    public void setNumberOfYearTransactions(NumberOfYearTransactions numberOfYearTransactions) {
        this.numberOfYearTransactions = numberOfYearTransactions;
    }

    public Pais getCountryOfRes() {
        return countryOfRes;
    }

    public void setCountryOfRes(Pais countryOfRes) {
        this.countryOfRes = countryOfRes;
    }

    public TypeOfClient getTypeOfClient() {
        return typeOfClient;
    }

    public void setTypeOfClient(TypeOfClient typeOfClient) {
        this.typeOfClient = typeOfClient;
    }

    public ChanelDistribution getChanelDistribution() {
        return chanelDistribution;
    }

    public void setChanelDistribution(ChanelDistribution chanelDistribution) {
        this.chanelDistribution = chanelDistribution;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustodia() {
        return custodia;
    }

    public void setCustodia(int custodia) {
        this.custodia = custodia;
    }

    public String getCustodio() {
        return custodio;
    }

    public void setCustodio(String custodio) {
        this.custodio = custodio;
    }

    public String getEstado_de_la_cuenta() {
        return estado_de_la_cuenta;
    }

    public void setEstado_de_la_cuenta(String estado_de_la_cuenta) {
        this.estado_de_la_cuenta = estado_de_la_cuenta;
    }

    public int getCanal_distribution() {
        return canal_distribution;
    }

    public void setCanal_distribution(int canal_distribution) {
        this.canal_distribution = canal_distribution;
    }

    public String getValue_corridor() {
        return value_corridor;
    }

    public void setValue_corridor(String value_corridor) {
        this.value_corridor = value_corridor;
    }

    public int getNu_license() {
        return nu_license;
    }

    public void setNu_license(int nu_license) {
        this.nu_license = nu_license;
    }

    public Boolean getCliente_es_PEP() {
        return cliente_es_PEP;
    }

    public void setCliente_es_PEP(Boolean cliente_es_PEP) {
        this.cliente_es_PEP = cliente_es_PEP;
    }

    public Boolean getWorld_check() {
        return world_check;
    }

    public void setWorld_check(Boolean world_check) {
        this.world_check = world_check;
    }

    public Boolean getLista_ley() {
        return lista_ley;
    }

    public void setLista_ley(Boolean lista_ley) {
        this.lista_ley = lista_ley;
    }

    public Boolean getProveedor() {
        return proveedor;
    }

    public void setProveedor(Boolean proveedor) {
        this.proveedor = proveedor;
    }

    public Boolean getOng() {
        return ong;
    }

    public void setOng(Boolean ong) {
        this.ong = ong;
    }

    public Boolean getRelated_shareholder() {
        return related_shareholder;
    }

    public void setRelated_shareholder(Boolean related_shareholder) {
        this.related_shareholder = related_shareholder;
    }

    public Boolean getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(Boolean correspondent) {
        this.correspondent = correspondent;
    }

    public Boolean getHigh_vol_operation() {
        return high_vol_operation;
    }

    public void setHigh_vol_operation(Boolean high_vol_operation) {
        this.high_vol_operation = high_vol_operation;
    }

    public Boolean getMoney_laund() {
        return money_laund;
    }

    public void setMoney_laund(Boolean money_laund) {
        this.money_laund = money_laund;
    }

    public Boolean getAdditional_act() {
        return additional_act;
    }

    public void setAdditional_act(Boolean additional_act) {
        this.additional_act = additional_act;
    }

    public Boolean getSmv() {
        return smv;
    }

    public void setSmv(Boolean smv) {
        this.smv = smv;
    }

    public int getClient_type() {
        return client_type;
    }

    public void setClient_type(int client_type) {
        this.client_type = client_type;
    }

    public int getLegal_nature() {
        return legal_nature;
    }

    public void setLegal_nature(int legal_nature) {
        this.legal_nature = legal_nature;
    }

    public int getCountry_origin() {
        return country_origin;
    }

    public void setCountry_origin(int country_origin) {
        this.country_origin = country_origin;
    }

    public int getCountry_of_res() {
        return country_of_res;
    }

    public void setCountry_of_res(int country_of_res) {
        this.country_of_res = country_of_res;
    }

    public int getCountry_of_nat() {
        return country_of_nat;
    }

    public void setCountry_of_nat(int country_of_nat) {
        this.country_of_nat = country_of_nat;
    }

    public int getCountry_of_inc() {
        return country_of_inc;
    }

    public void setCountry_of_inc(int country_of_inc) {
        this.country_of_inc = country_of_inc;
    }

    public int getEconomic_act() {
        return economic_act;
    }

    public void setEconomic_act(int economic_act) {
        this.economic_act = economic_act;
    }

    public int getNu_ann_tran() {
        return nu_ann_tran;
    }

    public void setNu_ann_tran(int nu_ann_tran) {
        this.nu_ann_tran = nu_ann_tran;
    }

    public int getAnn_tran_ammount() {
        return ann_tran_ammount;
    }

    public void setAnn_tran_ammount(int ann_tran_ammount) {
        this.ann_tran_ammount = ann_tran_ammount;
    }

    public int getEstimated_equity() {
        return estimated_equity;
    }

    public void setEstimated_equity(int estimated_equity) {
        this.estimated_equity = estimated_equity;
    }

    public int getMandate() {
        return mandate;
    }

    public void setMandate(int mandate) {
        this.mandate = mandate;
    }

    public AnnualTransactionAmount getAnnualTransactionAmount() {
        return annualTransactionAmount;
    }

    public void setAnnualTransactionAmount(AnnualTransactionAmount annualTransactionAmount) {
        this.annualTransactionAmount = annualTransactionAmount;
    }
}
