package com.vnu.retrieval.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class StatusConstants {

    @Getter
    @AllArgsConstructor
    public enum HttpConstants {

        SUCCESS(0, "Success"),

        ACCOUNT_NOT_FOUND(35_001, "Account not found"),

        CANNOT_GET_CPF_PROFILE(35_002, "Cannot get cpf profile"),

        CANNOT_GET_KYC_PROFILE(35_003, "Cannot get kyc profile"),

        CANNOT_GET_PROFILE(35_004, "Cannot get profile"),

        CANNOT_GET_PROMPTPAY_TRANSACTION_HISTORY(35_005, "Cannot get promptpay transaction history"),

        CANNOT_GET_LIVEAGENT_TICKETS(35_006, "Cannot get Live Agent tickets"),

        CANNOT_GET_LIVEAGENT_TICKET_DETAIL(35_007, "Cannot get Live Agent ticket detail"),

        CANNOT_UPLOAD_LIVEAGENT_EMPTY_FILE(35_008, "Cannot upload empty file"),

        UPLOAD_LIVEAGENT_INVALID_FORMAT_FILE(35_009, "Cannot upload invalid format file"),

        UPLOAD_LIVEAGENT_INVALID_FILE_SIZE(35_010, "Cannot upload file size bigger than 10MB"),

        CANNOT_UPLOAD_LIVEAGENT_FILE(35_011, "Cannot upload file to LA"),

        CANNOT_CREATE_TICKET(35_012, "Cannot create ticket"),

        CANNOT_GET_CPF_CHANGELOG(35_013, "Cannot get cpf changelog"),

        CANNOT_GET_CPF_WALLET_BALANCE(35_014, "Cannot get cpf wallet balance"),

        CANNOT_TRANSFER_WALLET(35_015, "Cannot transfer wallet balance"),

        CANNOT_DELETE_WALLET(35_016, "Cannot delete wallet"),

        CANNOT_GET_DELETED_WALLET(35_017, "Cannot get deleted wallet"),

        CANNOT_GET_DELETED_WALLET_BY_DATE(35_018, "Cannot get deleted wallet because date format invalid"),

        CANNOT_GET_LIST_CATEGORY(35_019, "Cannot get category list"),

        CANNOT_GET_CATEGORY_BY_INVALID_ID(35_020, "Cannot get category by invalid id"),

        CANNOT_GET_CATEGORY(35_021, "Cannot get category by null id");

        private Integer code;

        private String desc;

    }

}
