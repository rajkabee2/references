package com.example.demo;

import static jakarta.persistence.GenerationType.SEQUENCE;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "Transactions")
@Table(name = "transactions")
@NoArgsConstructor
public class Transaction implements Serializable {

	private static final long serialVersionUID = -7378727570813105930L;

	@Id
	@SequenceGenerator(name = "transactions_id_seq", sequenceName = "transactions_id_seq", allocationSize = 1)
	@GeneratedValue(strategy = SEQUENCE, generator = "transactions_id_seq")
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "uuid", nullable = false)
	private UUID uuid = UUID.randomUUID();

	@Column(name = "transaction_request_id")
	private Long transactionRequestId;

	@Column(name = "collection_agent_id")
	private Long collectionAgentId;

	@Column(name = "payout_agent_id")
	private Long payoutAgentId;

	@Column(name = "collection_method")
	private String collectionMethod;

	@Column(name = "payout_method")
	private String payoutMethod;

	@Column(name = "invoice_number")
	private String invoiceNumber;

	@Column(name = "invoice_path")
	private String invoicePath;

	@Column(name = "applicant_name")
	private String applicantName;

	@Column(name = "collection_country")
	private String collectionCountry;

	@Column(name = "payout_country")
	private String payoutCountry;

	@Column(name = "collection_currency")
	private String collectionCurrency;

	@Column(name = "collection_amount")
	private BigDecimal collectionAmount;

	@Column(name = "settlement_currency")
	private String settlementCurrency;

	@Column(name = "settlement_amount")
	private BigDecimal settlementAmount;

	@Column(name = "payout_currency")
	private String payoutCurrency;

	@Column(name = "payout_amount")
	private BigDecimal payoutAmount;

	@Column(name = "margin")
	private BigDecimal margin;

	@Column(name = "cross_rate")
	BigDecimal crossRate;

	@Column(name = "offer_rate")
	BigDecimal offerRate;

	@Column(name = "rate_quote_id")
	String rateQuoteId;

	@Column(name = "coll_vs_sett_rate")
	BigDecimal collVsSettRate;

	@Column(name = "sett_vs_fund_rate")
	BigDecimal settVsFundRate;

	@Column(name = "fund_vs_payout_rate")
	BigDecimal fundVsPayoutRate;

	@Column(name = "x_rate")
	BigDecimal xRate;

	@Column(name = "partner_commission")
	private BigDecimal partnerCommission;

	@Column(name = "partner_commission_currency")
	private String partnerCommissionCurrency;

	@Column(name = "service_charge")
	private BigDecimal serviceCharge;

	@Column(name = "commission")
	private BigDecimal commission;
	
	@Column(name = "batch_identifier")
	private BigDecimal batchIdentifier;

	@Column(name = "wire_charges")
	private BigDecimal wireCharges;

	@Column(name = "txn_cost")
	private BigDecimal txnCost;

	@Column(name = "txn_gain")
	private BigDecimal txnGain;

	@Column(name = "txn_source")
	private String txnSource;
	
	@Column(name = "txn_auth_code")
	private String txnAuthCode;

	@Column(name = "txn_risk_score")
	private Integer txnRiskScore;

	@Column(name = "promo_code")
	private String promoCode;

	@Column(name = "pass_through_info")
	private String passThroughInfo;

	@Column(name = "txn_purpose")
	private String txnPurpose;

	@Column(name = "control_number")
	private String controlNumber;

	@Column(name = "external_code")
	private String externalCode;

	@Column(name = "txn_hash")
	private String txnHash;

	@Column(name = "source_id")
	private Long sourceId;

	@Column(name = "association_id")
	private Long associationId;

	@Column(name = "ext_map_id_1")
	private String extMapId1;

	@Column(name = "ext_map_id_2")
	private String extMapId2;

	@Column(name = "ext_map_id_3")
	private String extMapId3;

	@Column(name = "ref_col_1")
	private String refCol1;

	@Column(name = "ref_col_2")
	private String refCol2;

	@Column(name = "ref_col_3")
	private String refCol3;

	@Column(name = "ref_col_4")
	private String refCol4;

	@Column(name = "ref_col_5")
	private String refCol5;

	@Column(name = "remarks")
	private String remarks;

	@Column(name = "is_active", nullable = false)
	private Boolean isActive;

	@Column(name = "created_by", nullable = false)
	 
	public String createdBy;

	// @CreationTimestamp
//	// @GeneratedValue
//	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
////	@Column(name = "created_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false) 
//	@Column(name = "created_date", columnDefinition="TIMESTAMPTZ", insertable = false, updatable = false) 
//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX", timezone = "Nepal/Kathmandu")
	
	@Column(name = "created_date", columnDefinition = "TIMESTAMPTZ")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
	public Timestamp createdDate;

	// @CreationTimestamp
	@Column(name = "created_date_utc", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false)
	 
	public Timestamp createdDateUTC;

	// @UpdateTimestamp
	@Column(name = "updated_by")
	 
	public String updatedBy;

	@Column(name = "updated_date")
	 
	public Timestamp updatedDate;

	@Column(name = "updated_date_utc")
	public Timestamp updatedDateUTC;

	@Column(name = "approved_by")
	public String approvedBy;

	@Column(name = "approved_date")
	public Timestamp approvedDate;

	@Column(name = "approved_date_utc")	 
	public Timestamp approvedDateUTC;
	
	@Column(name = "processing_date")
	public Timestamp processingDate;
	
	@Column(name = "processing_date_utc")	 
	public Timestamp processingDateUTC;
	
	//@Enumerated(EnumType.STRING)
	@Column(name = "posted_status")
	public String postedStatus;
	
	@Column(name = "posted_reference")	 	
	public String postedReference;
	
	@Column(name = "posted_date")
	public Timestamp postedDate;
	
	@Column(name = "posted_date_utc")	 	
	public Timestamp postedDateUTC;

	@Column(name = "entity_hash")
	public String entityHash;
}