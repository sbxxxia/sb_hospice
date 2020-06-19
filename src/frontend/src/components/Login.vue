<template>
    <v-container>
        <v-card max-width="40%">
            <v-card-title
                    class="headline grey lighten-2"
                    primary-title
            >
                Login
            </v-card-title>

            <v-form v-model="valid">
                <v-text-field
                        v-model="userId"
                        label="ID"
                        required
                        class="mx-10 mt-10"
                ></v-text-field>
                <v-text-field
                        v-model="passwd"
                        label="PW"
                        required
                        class="mx-10 mb-10"
                ></v-text-field>
            </v-form>
            <v-divider></v-divider>
            <v-card-actions>
                <v-btn
                        to="/join"
                        color="warning"
                        flat
                >
                    회원가입
                </v-btn>
                <v-spacer></v-spacer>
                <v-btn
                        color="primary"
                        flat
                        @click="login"
                >
                    로그인
                </v-btn>
            </v-card-actions>
        </v-card>
    </v-container>
</template>

<script>
export default {
    data () {
        return {
            userid: '',
            passwd: ''
        }
    },
    methods: {
        login () {
            this.$store.dispatch('user/login',{userid:'', passwd:''})
        }
    }
}
</script>

<style scoped>

</style>




<!--
<template>
    <v-container>
        <v-card max-width="40%">
            <v-card-title
                    class="headline grey lighten-2"
                    primary-title
            >
                Login
            </v-card-title>

            <v-form v-model="valid">
                <v-text-field
                        v-model="name"
                        :rules="nameRules"
                        :counter="10"
                        label="Name"
                        required
                ></v-text-field>
                <v-text-field
                        v-model="email"
                        :rules="emailRules"
                        label="E-mail"
                        required
                ></v-text-field>
            </v-form>

            <v-divider></v-divider>

            <v-spacer></v-spacer>

            <v-card-actions>
                <router-link to="/join">
                    <v-btn
                            color="warning"
                            flat
                            @click="dialog = false"
                    >
                        회원가입
                    </v-btn>
                </router-link>

                <v-spacer></v-spacer>

                <v-btn
                        color="primary"
                        flat
                        @click="dialog = false"
                >
                    로그인
                </v-btn>
            </v-card-actions>
        </v-card>
    </v-container>
</template>

<script>
    export default {
        name: "Login"
    }
</script>

<style scoped>

</style>-->