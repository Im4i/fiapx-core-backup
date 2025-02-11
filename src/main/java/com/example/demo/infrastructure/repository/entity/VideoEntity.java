package com.example.demo.infrastructure.repository.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDbBean
@DynamoDBTable(tableName = "tb_fiapx_core")
public class VideoEntity {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute
    private String nome;

    @DynamoDBAttribute
    private String email;

    @DynamoDBAttribute
    private String status;

    @DynamoDBAttribute
    private String dataCriacao;

    @DynamoDBAttribute
    private String dataAtualizacao;
}
