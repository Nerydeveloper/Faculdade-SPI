import { Button, Text, View } from 'react-native'
import React from 'react'
import { TextInput } from 'react-native'
import styles from './styles'

export default function Form() {





    return (
        <View style={styles.container}>
            <View style={styles.box}>
                <View>
                    <Text>Nome</Text>
                    <TextInput style={styles.textInput} keyboardType='visible-password' />
                </View>
                <View>
                    <Text>Sobrenome</Text>
                    <TextInput style={styles.textInput} keyboardType='visible-password' />
                </View>
                <View>
                    <Text>Telefone</Text>
                    <TextInput style={styles.textInput} keyboardType='visible-password' />
                </View>
                <View>
                    <Text>Email</Text>
                    <TextInput style={styles.textInput} keyboardType='email-address' autoComplete='' />
                </View>
                <View>
                    <Text>Senha</Text>
                    <TextInput style={styles.textInput} keyboardType='visible-password' />
                </View>
                <View>
                    <Text>CPF</Text>
                    <TextInput style={styles.textInput} keyboardType='visible-password' />
                </View>
                <Button style={styles.btnCadastrar} onPress={() => null} title='Cadastrar'/>
            </View>


        </View>
    )
}