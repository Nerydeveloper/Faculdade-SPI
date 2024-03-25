import React from "react";
import { View } from "react-native";
import styles from "./style";


export default function ListImage() {
    return (
        <View style={styles.boxListImage}>
            <View style={styles.boxImage}>

            </View>
            <View style={styles.boxLine}>
                <View style={styles.lineLarge}></View>
                <View style={styles.lineSmall}></View>
            </View>

        </View>
    );
}