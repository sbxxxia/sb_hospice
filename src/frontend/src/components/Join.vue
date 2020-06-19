<template>
    <v-container>
        <v-form ref="form" v-model="valid" lazy-validation >
            <v-text-field
                    v-model="name"
                    label="Name"
                    required
                    class="mt-16 mx-16"
            ></v-text-field>
            <v-text-field
                    v-model="userid"
                    :rules="idRules"
                    :counter="10"
                    label="ID"
                    required
                    class="mx-16"
            ></v-text-field>
            <v-text-field
                    v-model="passwd"
                    label="PW"
                    required
                    class="mx-16"
            ></v-text-field>
            <v-text-field
                    v-model="email"
                    label="Email"
                    :rules="emailRules"
                    required
                    class="mx-16"
            ></v-text-field>
            <v-text-field
                    v-model="phoneNumber"
                    label="Phone Number"
                    required
                    class="mb-16 mx-16"
            ></v-text-field>
            <v-divider></v-divider>
            <v-card-actions>
                <v-btn
                        to="/join"
                        color="normal"
                        flat
                        @click="dialog = false"
                >
                    취소
                </v-btn>
                <v-spacer></v-spacer>
                <v-btn
                        color="primary"
                        flat
                        @click="dialog = false"
                >
                    회원가입
                </v-btn>
            </v-card-actions>
        </v-form>
    </v-container>
</template>

<script>
    export default {
        name: "Join"
    }
</script>

<style scoped>

</style>