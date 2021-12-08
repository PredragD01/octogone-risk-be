package com.octagone.risk.risk.dos;

/*
    Created by: Predrag
    Date: 04.11.2021
*/


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.octagone.risk.risk.enums.Custodio;

public class UserDto {

    private int id;

    private int custodia;

    private String custodio;

    private String estado_de_la_cuenta;

    private int canal_distribution;

    private String value_corridor;

    private int nu_license;

    private Boolean cliente_es_PEP;

    private Boolean world_check;

    private Boolean lista_ley;

    private Boolean proveedor;

    private Boolean ong;

    private Boolean related_shareholder;

    private Boolean correspondent;

    private Boolean high_vol_operation;

    private Boolean money_laund;

    private Boolean additional_act;

    private Boolean smv;

    @JsonIgnore
    private int client_type;

    @JsonIgnore
    private int legal_nature;

    @JsonIgnore
    private int country_origin;

    @JsonIgnore
    private int country_of_res;

    @JsonIgnore
    private int country_of_nat;

    @JsonIgnore
    private int country_of_inc;

    @JsonIgnore
    private int economic_act;

    @JsonIgnore
    private int country_opera;

    @JsonIgnore
    private int nu_ann_tran;

    @JsonIgnore
    private int ann_tran_ammount;

    @JsonIgnore
    private int estimated_equity;

    @JsonIgnore
    private int mandate;

    //relations

    private AnnualTransactionAmountDto annualTransactionAmount;

    private ChanelDistributionDto chanelDistribution;

    private TypeOfClientDto typeOfClient;

    private PaisDto countryOfRes;

    private PaisDto countryOfInc;

    private PaisDto countryOfNat;

    private PaisDto countryOrigin;

    private PaisDto countryOpera;

    private ActividadEconomicaDto economicAct;

    private EstimatedEquityDto estimatedEquity;

    private NaturalezaJurdicaDto naturalezaJurdica;

    private NumberOfYearTransactionsDto numberOfYearTransactions;

    private ProductsDto products;

    //getters and setters


    public int getCountry_opera() {
        return country_opera;
    }

    public void setCountry_opera(int country_opera) {
        this.country_opera = country_opera;
    }

    public PaisDto getCountryOpera() {
        return countryOpera;
    }

    public void setCountryOpera(PaisDto countryOpera) {
        this.countryOpera = countryOpera;
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

    public AnnualTransactionAmountDto getAnnualTransactionAmount() {
        return annualTransactionAmount;
    }

    public void setAnnualTransactionAmount(AnnualTransactionAmountDto annualTransactionAmount) {
        this.annualTransactionAmount = annualTransactionAmount;
    }

    public ChanelDistributionDto getChanelDistribution() {
        return chanelDistribution;
    }

    public void setChanelDistribution(ChanelDistributionDto chanelDistribution) {
        this.chanelDistribution = chanelDistribution;
    }

    public TypeOfClientDto getTypeOfClient() {
        return typeOfClient;
    }

    public void setTypeOfClient(TypeOfClientDto typeOfClient) {
        this.typeOfClient = typeOfClient;
    }

    public PaisDto getCountryOfRes() {
        return countryOfRes;
    }

    public void setCountryOfRes(PaisDto countryOfRes) {
        this.countryOfRes = countryOfRes;
    }

    public PaisDto getCountryOfInc() {
        return countryOfInc;
    }

    public void setCountryOfInc(PaisDto countryOfInc) {
        this.countryOfInc = countryOfInc;
    }

    public PaisDto getCountryOfNat() {
        return countryOfNat;
    }

    public void setCountryOfNat(PaisDto countryOfNat) {
        this.countryOfNat = countryOfNat;
    }

    public PaisDto getCountryOrigin() {
        return countryOrigin;
    }

    public void setCountryOrigin(PaisDto countryOrigin) {
        this.countryOrigin = countryOrigin;
    }

    public ActividadEconomicaDto getEconomicAct() {
        return economicAct;
    }

    public void setEconomicAct(ActividadEconomicaDto economicAct) {
        this.economicAct = economicAct;
    }

    public EstimatedEquityDto getEstimatedEquity() {
        return estimatedEquity;
    }

    public void setEstimatedEquity(EstimatedEquityDto estimatedEquity) {
        this.estimatedEquity = estimatedEquity;
    }

    public NaturalezaJurdicaDto getNaturalezaJurdica() {
        return naturalezaJurdica;
    }

    public void setNaturalezaJurdica(NaturalezaJurdicaDto naturalezaJurdica) {
        this.naturalezaJurdica = naturalezaJurdica;
    }

    public NumberOfYearTransactionsDto getNumberOfYearTransactions() {
        return numberOfYearTransactions;
    }

    public void setNumberOfYearTransactions(NumberOfYearTransactionsDto numberOfYearTransactions) {
        this.numberOfYearTransactions = numberOfYearTransactions;
    }

    public ProductsDto getProducts() {
        return products;
    }

    public void setProducts(ProductsDto products) {
        this.products = products;
    }
}
